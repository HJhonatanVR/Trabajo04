import java.util.InputMismatchException;
import java.util.Scanner;
import data.PersonData;
import entities.Person;

public class Main {

    public static void main(String[] args) {

        PersonData pd = new PersonData();
        Scanner leer = new Scanner(System.in);
        int opt = 0;
        char resp, resp1, resp2, resp3;

        do{
            try{
                do {
                    System.out.println("-------------");
                    System.out.println("*CRUD PERSON*");
                    System.out.println("*************");
                    System.out.println("1 List ");
                    System.out.println("2 Create ");
                    System.out.println("3 Read ");
                    System.out.println("4 Update ");
                    System.out.println("5 Delete ");
                    System.out.println("0 Exit ");
                    System.out.println();
                    System.out.print("Please, Choice option: ");
                    
                    opt = leer.nextInt();
                    
                    
                    switch (opt) {
                        case 1:
                            System.out.println("Ok, you chosed the Option: List ");
                            System.out.println();
                            System.out.println("Listar Personas:");
                            System.out.println("****************");
                            for (Person d : pd.list("")) {
                            System.out.println(d.getId() + "\t" + d.getName() + "\t" + d.getAge() + "\t" + d.getSex());
                            }
                            break;
                        case 2:
                            System.out.println("You chosed the Option: Create ");
                            System.out.println();
                            System.out.println("Crear Persona:");
                            System.out.println("**************");
                            Person p= new Person();
                            leer.nextLine(); //Limpiar buffer
                            System.out.print("Ingrese Nombre: ");
                            p.setName(leer.nextLine());
                            System.out.print("Ingrese Edad: ");
                            p.setAge(leer.nextInt());
                            leer.nextLine(); 
                            System.out.print("Ingrese Sexo: ");
                            p.setSex(leer.nextLine().charAt(0));
                            pd.create(p);
                            break;
                        case 3:
                            System.out.println("OK, You chosed the Option: Read ");
                            System.out.println();
                            System.out.println("Obtener, Buscar Persona:"); 
                            System.out.println("************************");          
                            System.out.print("Ingrese ID:");
                            Person d= pd.get(leer.nextInt());
                            System.out.println();

                            if(d!=null){
                                System.out.println("ID: "+d.getId()+ "\t Nombre: "+d.getName()+ "\t Edad: "+d.getAge()+ "\t Sexo: "+d.getSex());
                            }else{
                                System.out.println("ID No encontrado");
                            }
                            break;
                        case 4:
                            System.out.println("Ok, you chosed the Option: Update ");
                            System.out.println();
                            System.out.println("Actualizar:"); 
                            System.out.println("***********");          
                            System.out.print("Ingrese ID:");
                            Person a= pd.get(leer.nextInt());
                            
                            if(a!=null){
                                System.out.println("Datos Actuales: "+a.getName()+"\t"+a.getAge()+"\t"+a.getSex());
                                System.out.println();
                                
                                System.out.print("Desea actualizar el Nombre Y/N? ");
                                resp1=leer.next().charAt(0);
                                if(resp1=='Y' || resp1=='y'){
                                    leer.nextLine();
                                    System.out.print("Ingrese nuevo nombre:");
                                    a.setName(leer.nextLine());
                                }
                               
                                
                                System.out.print("Desea actualizar la edad Y/N?");
                                
                                resp2=leer.next().charAt(0);
                            
                                if(resp2=='Y' || resp2=='y'){
                                    System.out.print("Ingrese nueva Edad:");
                                    a.setAge(leer.nextInt());
                            
                                }
                                leer.nextLine();
                                System.out.print("Desea actualizar Sexo Y/N?");
                                
                                resp3=leer.next().charAt(0);
                                
                                if(resp3=='Y' || resp3=='y'){
                                    leer.nextLine();
                                    System.out.print("Ingrese nuevo Sexo:");
                                    a.setSex(leer.next().charAt(0));
                                    
                                }
                                
                            
                            }else{
                            System.out.println("ID no encontrado");
                            }
                            break;
                            
                        case 5:
                            System.out.println("You chosed the Option: Delete ");
                            System.out.println();  
                            System.out.println("Eliminar persona:");
                            System.out.println("*****************");                    
                            System.out.print("Ingrese ID:");
                            pd.delete(leer.nextInt());
                            break;

                        default:
                            System.out.println("Opcion No Valida");
                    }
                
                } while (opt != 0);
            } catch(InputMismatchException e){
                System.out.println("Esa opcion No esta permitida.");
            }
            leer.nextLine();
            System.out.println("Desea Continuar Y/N?");
            resp=leer.nextLine().charAt(0);
            
        }while(resp!='N' && resp!='n');
        
    }
}
