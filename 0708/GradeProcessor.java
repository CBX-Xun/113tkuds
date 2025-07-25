public class GradeProcessor {
    public static void main(String[] args) {
        int[] scores = {78, 85, 92, 67, 88, 95, 73, 90};

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        System.out.printf("總分：%d\n平均分數：%.2f\n", total, average);

        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxIndex = i;
            }
            if (scores[i] < min) {
                min = scores[i];
                minIndex = i;
            }
        }

        System.out.println("最高分：" + max + "，索引：" + maxIndex);
        System.out.println("最低分：" + min + "，索引：" + minIndex);

        int aboveAverageCount = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAverageCount++;
            }
        }
        System.out.println("超過平均的人數：" + aboveAverageCount + " 位");

        System.out.println("所有學生成績如下：");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("學生編號" + i + ": " + scores[i]);
        }
    }
}
