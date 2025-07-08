public class StudentGradeSystem {

    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        char[] grades = new char[scores.length];

        int countA = 0, countB = 0, countC = 0, countD = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            grades[i] = getGrade(scores[i]);
            total += scores[i];

            if (scores[i] > max) {
                max = scores[i];
                maxIndex = i;
            }

            if (scores[i] < min) {
                min = scores[i];
                minIndex = i;
            }

            switch (grades[i]) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }
        }

        double average = total / (double) scores.length;
        int highAchievers = 0;

        for (int score : scores) {
            if (score > average) highAchievers++;
        }

        System.out.println("=== 學生成績統計報表 ===");
        System.out.println("編號\t分數\t等級");
        System.out.println("------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("S%02d\t%d\t%c\n", i + 1, scores[i], grades[i]);
        }

        System.out.println("\n=== 統計摘要 ===");
        System.out.printf("平均分數：%.2f\n", average);
        System.out.printf("最高分：%d (學生編號 S%02d)\n", max, maxIndex + 1);
        System.out.printf("最低分：%d (學生編號 S%02d)\n", min, minIndex + 1);
        System.out.println("各等級人數：");
        System.out.printf("A：%d 人\n", countA);
        System.out.printf("B：%d 人\n", countB);
        System.out.printf("C：%d 人\n", countC);
        System.out.printf("D：%d 人\n", countD);
        System.out.printf("高於平均的學生人數：%d 人 (%.2f%%)\n", highAchievers,
                (highAchievers * 100.0 / scores.length));
    }
}
