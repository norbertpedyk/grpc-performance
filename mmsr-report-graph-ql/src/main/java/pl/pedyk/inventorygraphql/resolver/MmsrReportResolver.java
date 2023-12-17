package pl.pedyk.inventorygraphql.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.pedyk.inventorygraphql.model.MmsrReport;

import java.util.UUID;

@Component
@Slf4j
public class MmsrReportResolver implements GraphQLQueryResolver {

    public MmsrReport mmsrReport(UUID id) {
        log.info("Retrieving Mmsr Report with id: {}", id);
        return MmsrReport.builder()
                .Id(id)
                .build();
    }
}
