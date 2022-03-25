package dBTOOBJECTOBJECTTOPOJO.SqlConnection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class QueryResponsedata {
    private static QueryResponsedata instance;
    private Map<String, List<Map<String, String>>> queryResponsedata = new HashMap<String, List<Map<String, String>>>();

    private QueryResponsedata() {
    }

    ;

    public static QueryResponsedata getInstance() {
        if (instance == null) {
            synchronized (QueryResponsedata.class) {
                if (instance == null) {
                    instance = new QueryResponsedata();
                }
            }
        }
        return instance;
    }

    public Map<String, List<Map<String, String>>> getQueryResponsedata() {
        return queryResponsedata;

    }

    public String getQueryResponse(String var, int rownum, String colName) {

        return queryResponsedata.get(var).get(rownum).get(colName);
    }
}
