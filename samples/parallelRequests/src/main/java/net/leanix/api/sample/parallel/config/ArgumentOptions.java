package net.leanix.api.sample.parallel.config;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

public class ArgumentOptions {

    @Option(name = "-h", usage = "shows this help")
    public boolean help = false;

    @Option(name = "--threadCount", usage = "number of threads that creates requests against server")
    public int threadCount = 10;

    @Option(name = "--apiHostName", usage = "The virtual host name of pathfinder")
    public String apiHostName = "local-eam.leanix.net";

    @Option(name = "--apiMtmHostName", usage = "The virtual host name of MTM which generates the JWT Token")
    public String apiMtmHostName = "local-svc.leanix.net";

    @Option(name = "--apiToken", usage = "The API Token used to get the JWT token")
    public String apiToken = "ekqUE3hTPskLPdrSnHxhjwJQNwYCW2KKVUDnpKJw";

    @Option(name = "--factSheetCount", usage = "The number of FactSheets that have to be generated")
    public int factSheetCount = 100;

    @Option(name = "--hierarchyLevel", usage = "The hierarchy level (1 -> only parents exists)")
    public int hierarchyLevel = 3;

    @Argument
    public List<String> arguments = new ArrayList<String>();

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
