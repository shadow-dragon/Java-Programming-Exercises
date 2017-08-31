public class Reformatory {
    private int i = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.i = this.i + 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        // returns new weight of person
        int weight = 1 + person.getWeight();
        person.setWeight(weight);
    }
    
    public int totalWeightsMeasured() {
        return this.i;
    }

}
