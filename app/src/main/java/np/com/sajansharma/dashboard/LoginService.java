package np.com.sajansharma.dashboard;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface LoginService {
    @POST(ApiConstants.LOGIN_USER)
    Call<LoginResponse> userLogin(@Body LoginModel loginModel);
}
