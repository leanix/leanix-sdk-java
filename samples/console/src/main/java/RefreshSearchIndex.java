import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class RefreshSearchIndex {
    public static void main(String[] args) {
        try {
            ApiClient apiClient = new ApiClientBuilder()
                    .withBasePath("https://local-eam.leanix.net/eaconnect/api/v1")
                    .withTokenProviderHost("local-svc.leanix.net")
                    .withApiToken("yWnMKtxNtN4jrVcATRBRW25usKYpU8mgOdTMUy8b")
                    .build();

            apiClient.invokeAPI("/commands/searchindexrefresh", "GET", new ArrayList(), null, new HashMap(), new HashMap(), "application/json", "application/json", new String[0], null);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
