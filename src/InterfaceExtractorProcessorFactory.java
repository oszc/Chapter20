import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * 8/10/14  4:23 PM
 * Created by JustinZhang.
 */
public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {

    @Override
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }

    @Override
    public Collection<String> supportedAnnotationTypes() {
        return Collections.singleton("annotations.ExtractInterface");
    }

    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> atds, AnnotationProcessorEnvironment env) {
        return new InterfaceExtractorProcessor(env);
    }
}
