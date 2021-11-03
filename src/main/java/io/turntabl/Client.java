package io.turntabl;

public abstract class Client{
        private String name;
        private String id;
        private Level level;

        public Client(String name, String id, Level level) {
                this.name = name;
                this.id = id;
                this.level = level;
        }


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public Level getLevel() {
                return level;
        }

        public void setLevel(Level level) {
                this.level = level;
        }

        public abstract String clientContactName();


}
