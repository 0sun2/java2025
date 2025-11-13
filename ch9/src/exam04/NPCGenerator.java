package exam04;

public class NPCGenerator {
    Person worker = new Person() {
        
        void Wake() {
            System.out.println("Wake up at 6!!");
            Work();
        }

        void Work() {
            System.out.println("Go to work!!");
        }
        
        void GenerateWorker() {
            Person worker = new Person() {
                void Wake() {
                    System.out.println("Wake up at 6!!");
                    Work();
            }
            void Work() {
                System.out.println("Go to work!!");
                }
            };
            walker.Wake();
        }
        void GeneratorPerson() {
            person.Wake();
        }

}
