package comm.example;
import java.util.List;
public class ToDoServiceImpl implements ToDoService
{
private ToDoDaoImpl dao=null;
{
	dao=new ToDoDaoImpl();
}
@Override
public ToDo createToDo(String ToDoName) {
	
	return dao.createToDo(ToDoName);
}
@Override
public List<ToDo> getAllToDos() {
	
	return dao.getAllToDos();
}
@Override
public ToDo findById(String toDoId) {
	
	return dao.findById(toDoId);
}
@Override
public void deleteToDo(String toDoId) {
	dao.deleteToDo(toDoId);
	
}
@Override
public void removeAllToDo() {
	
	dao.removeAllToDo();
}
}

