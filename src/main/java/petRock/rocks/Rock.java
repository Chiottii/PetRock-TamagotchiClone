package petRock.rocks;

public class Rock {

    private String name;
    private String gender;
    private int hungriness = 0;
    private int happiness = 5;
    private int tiredness = 0;
    private int cleanliness = 10;

    public Rock () {

    }
    
    public Rock (String name, String gender, int hungriness, int happiness, int tiredness, int cleanliness){
        this.name = name;
        this.gender = gender;
        this.hungriness = hungriness;
        this.happiness = happiness;
        this.tiredness = tiredness;
        this.cleanliness = cleanliness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHungriness() {
        return hungriness;
    }

    public void setHungriness(int hungriness) {
        this.hungriness = hungriness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public void feed() {
        hungriness -= 5;
        tiredness += 2;
        if (hungriness < 0) {
            hungriness = 0;
        }
        if (tiredness > 10) {
            tiredness = 10;
        }
    }

    public void walk() {
        happiness += 3;
        tiredness += 2;
        if (happiness > 10) {
            happiness = 10;
        }
        if (tiredness > 10) {
            tiredness = 10;
        }
    }

    public void clean() {
        cleanliness = 10;
    }

    public void pet() {
        happiness += 3;
        if (happiness > 10) {
            happiness = 10;
        }
    }

    public String getMood() {
        if (tiredness == 10) {
            return "asleep";
        } else if (tiredness >= 8){
            return "tired";
        } else if (hungriness >= 7) {
            return "hungry";
        } else if (cleanliness <= 3) {
            return "dirty";
        } else if (happiness >= 7) {
            return "happy";
        } else if (happiness >=4) {
            return "bored";
        } else {
            return "sad";
        }
    }

    public void passTime() {
        hungriness++;
        cleanliness--;
        if (tiredness == 10) {
            tiredness = 0;
        } else {
            tiredness++;
        }
        if (hungriness >= 7) {
            happiness--;
        }
        if (cleanliness < 3) {
            happiness--;
        }
        if (hungriness > 10) {
            hungriness = 10;
        }
        if (cleanliness < 0) {
            cleanliness = 0;
        }
        if (happiness < 0) {
            happiness = 0;
        }
    }

}
