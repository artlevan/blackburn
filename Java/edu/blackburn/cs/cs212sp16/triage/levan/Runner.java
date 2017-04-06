/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.triage.levan;

import edu.blackburn.cs.cs212sp16.er.*;
import static edu.blackburn.cs.cs212sp16.er.Patient.newPatient;

/**
 *
 * @author arthur.levan
 */
public class Runner {

    public static void main(String[] args) {
        Patient a = Patient.newPatient();
        Patient b = Patient.newPatient();
        Patient c = Patient.newPatient();

        double hp = 0;
        int count = 0;
        runER();

//        do {
//            hp = a.getHealth();
//            System.out.println(hp);
//            count++;
//        } while (hp != 0);
//        System.out.println("Ticked: " + count + " times.");
//        System.out.println(a.getPriority());
    }

    public static void runER() {
        TriageStack stack = new TriageStack();
        TriageQueue queue = new TriageQueue();
        Doctor dr = new Doctor(queue, stack);
        int stackHealed = 0;
        int queueHealed = 0;

        for (int i = 0; i < 100000; i++) {
            Patient p = Patient.newPatient();
            if (p.getPriority() <= 5) {
                stack.push(p);
            }
            if (p.getPriority() > 5) {
                queue.enqueue(p);
            }
            if (i >= 10) {
                dr.heal();
            }
        }
        stackHealed = 100000 - stack.depth();
        queueHealed = 100000 - queue.length();
        System.out.println(stackHealed + " Patients healed from stack");
        System.out.println(queueHealed + " Patients healed from queue");
        System.out.println(stack.depth() + " Patients left in stack");
        System.out.println(queue.length() + " Patients left in queue");
        System.out.println(dr.getHealth());
    }
}
