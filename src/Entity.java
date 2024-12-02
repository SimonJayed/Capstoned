public abstract class Entity {
    public String name;
    public boolean isAlive;
    public String gender;

    public Entity(String name){
        this.name = name;
        gender = "It";
        isAlive = true;
    }

    public String toString() {
        return null;
    }

    public static class Human extends Entity{
        public Human(String name, String gender){
            super(name);
            this.gender = gender;
        }

        public String toString(){
            return "CHAEWON NUMBER ONE!!";
        }
    }

    public static class Compy extends Entity{
        public Compy(String name, String gender){
            super(name);
            this.gender = gender;
        }

        public String toString(){
            return "Compy mwew mwew krek krek!!";
        }
    }
    public static class Coelacanth extends Entity{
        public Coelacanth(String name, String gender){
            super(name);
            this.gender = gender;
        }

        public String toString(){
            return "Silikent blop blop chaewonxsimon!!";
        }
    }
    public static class Pterosaur extends Entity{
        public Pterosaur(String name, String gender){
            super(name);
            this.gender = gender;
        }

        public String toString(){
            return "Ptero qwak qwak cak!! cok?";
        }
    }
}
