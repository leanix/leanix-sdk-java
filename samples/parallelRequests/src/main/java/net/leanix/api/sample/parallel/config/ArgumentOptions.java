package net.leanix.api.sample.parallel.config;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.kohsuke.args4j.Option;

public class ArgumentOptions {

    @Option(name = "-h", usage = "shows this help")
    public boolean help = false;

    @Option(name = "--threadCount", usage = "number of threads that creates requests against server")
    public int threadCount = 10;

    @Option(name = "--apiHostName", usage = "The virtual host name of pathfinder")
    public String apiHostName = "local-pf.leanix.net";

    @Option(name = "--apiMtmHostName", usage = "The virtual host name of MTM which generates the JWT Token")
    public String apiMtmHostName = apiHostName;

    @Option(name = "--apiToken", usage = "The API Token used to get the JWT token")
    public String apiToken = "ekqUE3hTPskLPdrSnHxhjwJQNwYCW2KKVUDnpKJw";

    @Option(name = "--factSheetCount", usage = "The number of FactSheets that have to be generated")
    public int factSheetCount = 100;


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
