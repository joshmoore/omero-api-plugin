package org.openmicroscopy.api.factories


import org.gradle.api.NamedDomainObjectFactory
import org.gradle.api.Project
import org.openmicroscopy.api.extensions.SplitExtension

class SplitFactory implements NamedDomainObjectFactory<SplitExtension> {

    final Project project

    SplitFactory(Project project) {
        this.project = project
    }

    @Override
    SplitExtension create(String name) {
        return new SplitExtension(name, project)
    }

}
