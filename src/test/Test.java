import ua.martynenko.vacancymvc.model.Vacancy;
import ua.martynenko.vacancymvc.parser.AbsoftStrategy;
import ua.martynenko.vacancymvc.parser.EpamStrategy;
import ua.martynenko.vacancymvc.parser.IntroproStrategy;

import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws InterruptedException {


        EpamStrategy strategy = new EpamStrategy();
        List<Vacancy> ss = strategy.getVacancies();
//        int count2 = 0;
//
//        for (int i = 0; i < ss.size(); i++) {
//            count2++;
//            System.out.println("-----------------   " + count2 + "  -----------------------------");
//            System.out.println("Link = " + ss.get(i).getLink());
//            System.out.println(ss.get(i).getTitle());
//            System.out.println("Project_description = " + ss.get(i).getProject_description());
//            System.out.println("Date = " + ss.get(i).getDate());
//            System.out.println("Resposibilities = " + ss.get(i).getResponsibilities());
//            System.out.println("Skills = " + ss.get(i).getSkills_required());
//            System.out.println(ss.get(i).getSkills_required());
//            System.out.println(ss.get(i).getType());
//
//
//        }


    }

}
