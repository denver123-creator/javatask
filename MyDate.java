public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();
        date1.setDate(12, 12, 2012);

        System.out.println(date1.toString());
        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());
        System.out.println(date1);

        date1.setDate(1, 1, 1978);
        date2.setDate(21, 8, 1984);

        // display leapyears
        DateTask.leapYears();
    }
}
