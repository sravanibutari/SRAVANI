package comm.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class ToDoDaoImpl implements ToDoDao
{
	private List<ToDo> toDoList=null;
	private ToDo toDo;
	
	{
		 toDoList = new ArrayList<ToDo>();
	}
	public ToDo createToDoDao(String toDoName) {
		String str[]=UUID.randomUUID().toString().split("-");
		toDo=new ToDo((str[0]+str[1]).toLowerCase(),toDoName);
		toDoList.add(toDo);
		return toDo;
		
	}

	public List<ToDo> getAllToDoDos() {
		
		if(toDoList.isEmpty())
		{
			System.out.println("list is empty");
		}
		return toDoList;
	}

	public ToDo findById(String toDoId) {
		
	
			Iterator<ToDo> iterator=toDoList.iterator();
			
			while(iterator.hasNext())
			{
				toDo=iterator.next();
				if(toDo.getToDoId()==toDoId)
				{
					
					System.out.println(toDo.getToDoId());
					break;
				}
			}
		
		
		return toDo;
	}

	public void deleteToDo(String toDoId) {
		if(toDoList.isEmpty())
		{
			System.out.println("todo list is empty.");
			
		}
		toDo=findById(toDoId);
		if(toDo==null)
		{
			System.out.println("no such todo to delete");
		}
		else
		{
			toDoList.remove(toDo);
			System.out.println("remoded sucessfully with id: "+toDoId);
		}
		
	}

	public void removeAllToDo() {
		toDoList.removeAll(toDoList);
		
	}

	@Override
	public ToDo createToDo(String toDoName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ToDofindById(String toDoId) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	

