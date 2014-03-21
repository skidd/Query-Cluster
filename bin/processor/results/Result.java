package processor.results;

import java.util.Date;
import java.util.List;

import processor.query.JsonPath;
import processor.query.Query;

public interface Result {
	public Object getObject(JsonPath path);
	public Object getObject(String variable);
	public String getString(String variable);
	public boolean getBoolean(String variable);
	public int getInteger(String variable);
	public float getFloat(String variable);
	public Date getDate(String variable);
	public List<Object> getCollection(String variable);
	public Query getQuery();
}
