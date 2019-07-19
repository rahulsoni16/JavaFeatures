package com.code.util;

import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;

import java.util.Optional;
import java.util.function.Supplier;

public class NullResolver {
    private NullResolver() {
	throw new IllegalStateException("Utility class");
    }

    public static <T> Optional<T> resolve(Supplier<T> resolver) {
	try {
	    T result = resolver.get();
	    return ofNullable(result);
	} catch (NullPointerException e) {
	    /*
	     * To satisfy SonarQube, we are adding a logger for error but
	     * forcing it to be used only if Trace is enabled. This is because
	     * intention is never to log this error message because the
	     * NullPointer is expected in most of the scenarios and it is
	     * properly handled by returning Optional.empty().
	     */

	    return empty();
	}
    }
}
