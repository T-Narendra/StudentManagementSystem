public class StudentClass {
        private int id;
        private String name;
        private Double marks;
        public StudentClass(int id, String name, Double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Double getMarks() {
            return marks;
        }
        public void setMarks(Double marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
        }
    }