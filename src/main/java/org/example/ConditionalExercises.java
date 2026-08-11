package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        return x < 5;
    }

    public String getAgeGroup(int age) {
              if (age < 13) {
            return "child";
        } else if (age < 20) {
            return "teen";
        } else {
                  return "adult";
              }
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();
            if (passwordLength > 7) {
                return true;
            } else
        return false;
    }
}
