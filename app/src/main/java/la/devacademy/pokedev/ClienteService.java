package la.devacademy.pokedev;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by deibytb on 18/09/15.
 */
public interface ClienteService {

    @GET("/users")

    void getCliente(Callback<List<Cliente>> callback);




}
