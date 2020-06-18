package com.example.algoritma;

import java.io.*;

public class Parrot  {

    public static void main(String[] args) {

        try (InputStream is = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("parrots.dat")))) {
            Parrot parrot = (Parrot) ((ObjectInputStream) is).readObject(); // l2
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


