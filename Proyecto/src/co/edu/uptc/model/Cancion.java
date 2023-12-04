package src.co.edu.uptc.model;

public class Cancion {

        private String name;
        private String duracion;

        public Cancion(String name, String duracion) {
            this.name = name;
            this.duracion = duracion;
        }

        public String getName() {
            return name;
        }

        public String getDuracion() {
            return duracion;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDuracion(String duracion) {
            this.duracion = duracion;
        }
}
