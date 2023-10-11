package view;

import model.History;
import model.Worker;
import controller.Manager;
import java.util.ArrayList;
import model.History;
import model.Worker;


public class Main {
    private static Manager manager = new Manager();

    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
        //loop until user want to exit
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.addWorker(lw);
                    break;
                case 2:
                    manager.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    manager.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    manager.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}
