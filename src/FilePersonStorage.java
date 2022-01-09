import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePersonStorage implements PersonStorage{
    private FileWriter fw;

    public FilePersonStorage(){
        File file = new File("PersonStorage");
        try {
            fw = new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addPerson(Person p) {
        Person existingPerson = getPerson(p.ssn);
        if(existingPerson!= null) throw new IllegalStateException("Person already exist");

        String toWrite = p.ssn + ";" + p.name + ";"+ p.dob;
        try {
            fw.append(toWrite);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Person getPerson(int ssn) {
        return null;
    }
}
