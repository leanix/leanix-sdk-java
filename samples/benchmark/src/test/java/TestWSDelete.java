import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import net.leanix.benchmark.WorkspaceHelper;
import net.leanix.dropkit.api.ApiException;

@Ignore("Just used to test the delete api")
public class TestWSDelete {

    @Before
    public void setup() {
        System.setProperty("api.hostname", "boot2docker.leanix.net");
        System.setProperty("api.userEmail", "cio@meshlab.de");
        System.setProperty("api.key", "47df6d16f009461082abaa9378eec0b8");
        System.setProperty("api.clientSecret", "ldtP4b9o3K6IkKm3SolA_eam");
    }

    @Test
    public void testDelete() throws ApiException, net.leanix.api.common.ApiException {

        WorkspaceHelper workspaceHelper = new WorkspaceHelper("schrottWS");
        workspaceHelper.getExistingWorkspaceOrCreateNew();

        // try to delete WS
        workspaceHelper.deleteWorkspace();
    }
}
