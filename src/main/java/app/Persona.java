package app;

public class Persona {
    private int id, age;
    private String name, quote, job, gender, image;
    private String[] needs, goals, pains, skills;
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getQuote() {
        return quote;
    }
    public String getJob() {
        return job;
    }
    public String getGender() {
        return gender;
    }
    public String getImage() {
        return image;
    }
    public String[] getNeeds() {
        return needs;
    }
    public String[] getGoals() {
        return goals;
    }
    public String[] getPains() {
        return pains;
    }
    public String[] getSkills() {
        return skills;
    }
    public Persona(int id, int age, String name, String quote, String job, String gender, String image, String needs,
            String goals, String pains, String skills) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.quote = quote;
        this.job = job;
        this.gender = gender;
        this.image = image;
        this.needs = needs.split("_");
        this.goals = goals.split("_");
        this.pains = pains.split("_");
        this.skills = skills.split("_");
    }

    
}
