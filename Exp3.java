import java.util.Scanner;

class Employee {
    int empId;
    String empName, address, mailId, mobile;
    double basicPay;

    void setData(int id, String name, String addr, String mail, String mob, double bp) {
        empId = id;
        empName = name;
        address = addr;
        mailId = mail;
        mobile = mob;
        basicPay = bp;
    }

    void calculateSalary(double daPer, double hraPer, double pfPer, double staffPer, String designation) {

        double DA = basicPay * daPer / 100;
        double HRA = basicPay * hraPer / 100;
        double PF = basicPay * pfPer / 100;
        double staffClub = basicPay * staffPer / 100;

        double grossSalary = basicPay + DA + HRA;
        double netSalary = grossSalary - PF - staffClub;

        System.out.println("\nOutput");

        System.out.println("\nEmployee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No.: " + mobile);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: " + (int) basicPay);

        System.out.println("DA = " + DA);
        System.out.println("HRA = " + HRA);
        System.out.println("PF = " + PF);
        System.out.println("Staff Club Fund = " + staffClub);
        System.out.println("Gross Salary = " + grossSalary);
        System.out.println("Net Salary = " + netSalary);
    }
}

class Programmer extends Employee {

    void salary() {
        calculateSalary(97, 10, 12, 1, "Programmer");
    }
}

class AssistantProfessor extends Employee {

    void salary() {
        calculateSalary(110, 20, 12, 5, "Assistant Professor");
    }
}

class AssociateProfessor extends Employee {

    void salary() {
        calculateSalary(130, 30, 12, 10, "Associate Professor");
    }
}

class Professor extends Employee {

    void salary() {
        calculateSalary(140, 40, 12, 15, "Professor");
    }
}

class Exp3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");

        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        sc.nextLine();

        System.out.print("Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Mail ID: ");
        String mail = sc.nextLine();

        System.out.print("Mobile No.: ");
        String mobile = sc.nextLine();

        System.out.print("Basic Pay: ");
        double basicPay = sc.nextDouble();


        if (ch == 1) {

            if (basicPay >= 15000 && basicPay <= 20000) {

                Programmer p = new Programmer();
                p.setData(id, name, address, mail, mobile, basicPay);
                p.salary();

            } else {

                System.out.println("Error");

            }

        } else if (ch == 2) {

            if (basicPay >= 20001 && basicPay <= 30000) {

                AssistantProfessor ap = new AssistantProfessor();
                ap.setData(id, name, address, mail, mobile, basicPay);
                ap.salary();

            } else {

                System.out.println("Error");

            }

        } else if (ch == 3) {

            if (basicPay >= 30001 && basicPay <= 40000) {

                AssociateProfessor asp = new AssociateProfessor();
                asp.setData(id, name, address, mail, mobile, basicPay);
                asp.salary();

            } else {

                System.out.println("Error");
            }

        } else if (ch == 4) {

            if (basicPay > 40000) {

                Professor prof = new Professor();
                prof.setData(id, name, address, mail, mobile, basicPay);
                prof.salary();

            } else {

                System.out.println("Error");

            }

        } else {

            System.out.println("Invalid Choice");

        }

        sc.close();
    }
}
