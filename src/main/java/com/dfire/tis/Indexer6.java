package com.dfire.tis;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.annotation.processing.Messager;
import javax.tools.Diagnostic;

@SuppressWarnings("all")
@SupportedAnnotationTypes({ "*" })
public class Indexer6 extends AbstractProcessor {

	public Indexer6() {
		super();
	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {

		if (env.processingOver()) {
			// TODO we should not write until processingOver
			return false;
		}

		Messager messager = processingEnv.getMessager();
		messager.printMessage(Diagnostic.Kind.WARNING, "hahahahah: ");

		for (Element indexable : env.getElementsAnnotatedWith(Indexable.class)) {
			messager.printMessage(Diagnostic.Kind.NOTE, "element: " + indexable);
		}

		for (TypeElement te : annotations) {
			for (Element e : env.getElementsAnnotatedWith(te)) {
				messager.printMessage(Diagnostic.Kind.NOTE, "Printing: " + e.toString());
			}
		}

		// System.out.println("hello======================================================");

		// throw new
		// RuntimeException("hello======================================================");
		return false;
	}

	@Override
	public SourceVersion getSupportedSourceVersion() {
		return SourceVersion.latestSupported();
	}

}
