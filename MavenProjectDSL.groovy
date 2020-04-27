job('First-Maven-Project-Via-DSL'){
    description("First Maven job generated by DSL on ${new Date()}, the project is a small Maven project hosted on GitHub.")
    scm{
        git("https://github.com/philduba/Jenkins_Upgradev3.git", 'master')
    }
    triggers{
        scm("H/5 * * * *")
    }
    steps{
        // maven('clean package','maven-samples/single-module/pom.xml')
        maven{
            goals('clean')
            goals('package')
            rootPOM('maven-samples/single-module/pom.xml')
            mavenInstallation('LocalMaven')
        }
    }
    publishers{
        //archive the war file generated
        archiveArtifacts '**/*.jar'
    }
}