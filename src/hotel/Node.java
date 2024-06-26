package hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Node {

   public String name;
   public List<Node> children;
   public String type;

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", children=" + children +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Node peopleCulture = new Node();
        peopleCulture.name = "People&Culture";
        peopleCulture.type = "Division";
        List<Node> peopleCultureList = new ArrayList<>();

        Node generalPeopleCulture = new Node();
        generalPeopleCulture.name = "General People and Culture";
        generalPeopleCulture.type = "Department";
        List<Node> generalPeopleCultureList = new ArrayList<>();
        Node directorOfPeopleCulture = new Node();
        directorOfPeopleCulture.name = "Director of people and culture";
        directorOfPeopleCulture.type = "Designation";
        generalPeopleCultureList.add(directorOfPeopleCulture);

        Node talentAcquisitionManager = new Node();
        talentAcquisitionManager.name = "Talent Acquisition Manager";
        talentAcquisitionManager.type = "Designation";
        generalPeopleCultureList.add(talentAcquisitionManager);

        Node peopleCultureExecutive = new Node();
        peopleCultureExecutive.name = "people culture executive";
        peopleCultureExecutive.type = "Designation";
        generalPeopleCultureList.add(peopleCultureExecutive);

        Node peopleCultureCoordinator = new Node();
        peopleCultureCoordinator.name = "people Culture Coordinator";
        peopleCultureCoordinator.type = "Designation";
        generalPeopleCultureList.add(peopleCultureCoordinator);
        generalPeopleCulture.children=generalPeopleCultureList;

        generalPeopleCultureList.add(directorOfPeopleCulture);
        generalPeopleCultureList.add(talentAcquisitionManager);
        generalPeopleCultureList.add(peopleCultureExecutive);
        generalPeopleCultureList.add(peopleCultureCoordinator);


        Node learningDevelopment = new Node();
        Node ambassadorAccommodation = new Node();

        peopleCultureList.add(generalPeopleCulture);
        peopleCultureList.add(learningDevelopment);
        peopleCultureList.add(ambassadorAccommodation);
        peopleCulture.children=peopleCultureList;
        System.out.println(peopleCultureList);
    }
}