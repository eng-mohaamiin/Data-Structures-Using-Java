package Assigments02;

class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;




    // constractor one does not has default value
    public  BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // constractor 2 has a default age value
    public  BMI(String name,  double weight, double height){
        this.name = name;
        this.age = 20;
        this.weight = weight;
        this.height = height;
    }


    // calculate bmi
    public double getBMI (){
        return (weight * 703) / (height * height);

    }

    // get bmi status
    public String getStatus() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }


//   ------------------ getters fucntions -----------------------//

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }



}




public class BMIProgram {

    static void main() {
        BMI person1 = new BMI("Mohamed Amiin", 20, 66, 70.47);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Weight: " + person1.getWeight());
        System.out.println("Height: " + person1.getHeight());
        System.out.println("BMI: " + person1.getBMI());
        System.out.println("Status: " + person1.getStatus());

    }
}
