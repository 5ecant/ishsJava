public class datatype {
    public static void main(String[] args) {
        // DataType & Casting (자료형과 형변환)
        float gpa = 4.13F;
        int score = (int) 9.99;
        System.out.println(gpa);
        score = (int) gpa;
        gpa = score;
        System.out.println(score);
    }
}
