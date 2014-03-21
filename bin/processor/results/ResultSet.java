package processor.results;

import processor.query.Query;
import processor.services.ReadService;
import processor.exceptions.FreebaseServiceException;

public interface ResultSet {
	public int size() throws FreebaseServiceException;
	public boolean isEmpty();
	public boolean hasNext() throws FreebaseServiceException;
	public Result next() throws FreebaseServiceException;
	public Result current();
	public void reset();
	public ReadService getReadService();
	public Query getQuery();
}
