package np.com.sajansharma.dashboard;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @Headers({"x-api-key: NUjKEe5xUTsmz4rjxsyuiq7Yi2Tp36"})
    @FormUrlEncoded
    @POST(ApiConstants.LOGIN_USER)
    Call<LoginModel> login(@Field("username") String username,
                            @Field("password") String password);

}
