/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.triage.levan;

import edu.blackburn.cs.cs212sp16.er.AbstractQueue;
import edu.blackburn.cs.cs212sp16.er.ListElement;
import edu.blackburn.cs.cs212sp16.er.Patient;

/**
 *
 * @author Artmar
 */
public class TriageQueue extends AbstractQueue {

    @Override
    public void enqueue(Patient ptnt) {
        if (this.start == null) {
            this.start = new ListElement(ptnt);
        } else {
            this.end = new ListElement(ptnt);
        }
        start.setNext(this.end);
        increment();
    }

    @Override
    public Patient dequeue() {

        if (this.start.getPatient() != null) {
            this.decrement();
            return this.start.getPatient();
        }

        return null;
    }

}
