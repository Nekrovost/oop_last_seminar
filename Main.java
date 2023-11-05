import Company.Company;
import JobAgency.JobAgency;
import Workers.Master;
import Workers.Professional;
import Workers.Student;

public class Main {
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company roga = new Company("roga", 100, jobAgency);
        Company copita = new Company("copita", 200, jobAgency);
        Company KillMePlz = new Company("KillMePlz", 300, jobAgency);

        Master name123 = new Master("123");
        Master name1234 = new Master("1234");
        Student name12345 = new Student("12345");
        Professional name123456 = new Professional("123456");
        
        jobAgency.registerObserver(name123);
        jobAgency.registerObserver(name1234);
        jobAgency.registerObserver(name12345);
        jobAgency.registerObserver(name123456);

        for (int i = 0; i < 2; i++){
            roga.needEmployee();
            copita.needEmployee();
            KillMePlz.needEmployee();
            System.out.println();
        }
    }
}