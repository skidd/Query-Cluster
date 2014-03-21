package processor.results;

import processor.query.Query;
import processor.services.ReadService;

public class DefaultResultSet extends AbstractResultSet {
	
	public DefaultResultSet(Query query, ReadService readService) {
		super(query, readService);
	}
	
}
