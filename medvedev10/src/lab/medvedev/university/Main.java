package lab.medvedev.university;

public class Main {

  public static void main(String[] args) {
    Institute institute = new Institute("ВГУ", "Университетская площадь 1" );
    Faculty faculty = new Faculty("Факультет Компьютерных Наук");
    Course course = new Course("Введение в програмирование", 1, 20);
    Lecturer lecturer = new Lecturer("Соломатин Дмитрий Иванович", "ComputerScience");
    ResearchAssociate researchAssociate = new ResearchAssociate("Научный сотрудник", "Информационные технологии");
    ScientificPaper scientificPaper = new ScientificPaper("Моделирование закона Брукса");
    lecturer.addCourse(course);
    institute.hire(researchAssociate);
    institute.hire(lecturer);
    researchAssociate.write(scientificPaper);
    researchAssociate.publishResults(scientificPaper);
    institute.fire(researchAssociate);
  }
}
