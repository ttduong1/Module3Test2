public class Students {
    private String studentId;
    private String studentName;
    private int age;
    private String sex;
    private String phone;
    private String address;
    private float html;
    private float css;
    private float javascript;
    private float avgMark;

    public Students(String studentId, String studentName, int age, String sex, String phone, String address, float html, float css, float javascript) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.html = html;
        this.css = css;
        this.javascript = javascript;
        this.avgMark = (html + css + 2*javascript) / 4;
    }

    // Getter and setter methods
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getHtml() {
        return html;
    }
    public void setHtml(float html) {
        this.html = html;
        this.avgMark = (html + css + javascript) / 3;
    }
    public float getCss() {
        return css;
    }
    public void setCss(float css) {
        this.css = css;
        this.avgMark = (html + css + javascript) / 3;
    }
    public float getJavascript() {
        return javascript;
    }
    public void setJavascript(float javascript) {
        this.javascript = javascript;
        this.avgMark = (html + css + javascript) / 3;
    }
    public float getAvgMark() {
        return avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", html=" + html +
                ", css=" + css +
                ", javascript=" + javascript +
                ", avgMark=" + avgMark +
                '}';
    }
    public void displayData() {
        System.out.printf("%-10s %-20s %-5s %-10s %-15s %-20s %-5s %-5s %-5s %-10s\n",
                "studentId:", "studentName:", "age:", "sex:", "phone:", "address:", "html:", "css:", "js:", "avgMark:");
        System.out.printf("%-10s %-20s %-5s %-10s %-15s %-20s %-5.1f %-5.1f %-5.1f %-10.1f\n",
                this.studentId, this.studentName, this.age, this.sex, this.phone, this.address, this.html, this.css,
                this.javascript, this.avgMark);
    }
//    private static final int MAX_STUDENTS = 200;
//    private static Students[] students = new Students[MAX_STUDENTS];
//    private static int numStudents = 0;
//    Scanner scanner = new Scanner(System.in);
//    int choice;
//
//        do {
//        System.out.println("==== Student Management ====");
//        System.out.println("1. Nh???p s??? sinh vi??n v?? nh???p th??ng tin cho c??c sinh vi??n.");
//        System.out.println("2. In th??ng tin c??c sinh vi??n ??ang qu???n l??.");
//        System.out.println("3. S???p x???p c??c sinh vi??n theo ??i???m trung b??nh t??ng d???n.");
//        System.out.println("4. Nh???p v??o t??n sinh vi??n v?? t??m ki???m sinh vi??n theo t??n.");
//        System.out.println("5. Th???ng k?? s??? sinh vi??n nam, n??? ??ang qu???n l??.");
//        System.out.println("6. In ra th??ng tin c??c sinh vi??n x???p lo???i gi???i v?? trung b??nh.");
//        System.out.println("7. Tho??t.");
//        System.out.print("Nh???p l???a ch???n c???a b???n: ");
//        choice = scanner.nextInt();
//
//        switch (choice) {
//            case 1:
//                addStudents(scanner);
//                break;
//            case 2:
//                printStudents();
//                break;
//            case 3:
//                sortStudentsByAvgMark();
//                break;
//            case 4:
//                searchStudentByName(scanner);
//                break;
//            case 5:
//                countStudentsByGender();
//                break;
//            case 6:
//                printStudentsByClassification();
//                break;
//            case 7:
//                System.out.println("Ch????ng tr??nh k???t th??c.");
//                break;
//            default:
//                System.out.println("L???a ch???n kh??ng h???p l???. Vui l??ng ch???n l???i.");
//        }
//    } while (choice != 7);
}

