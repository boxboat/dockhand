package com.boxboat.jenkins.library.docker

import com.boxboat.jenkins.library.config.BaseConfig
import com.boxboat.jenkins.library.config.Config

class Registry extends BaseConfig<Registry> implements Serializable {

    String scheme

    String host

    String credential

    def getRegistryUrl() {
        return "${scheme}://${host}"
    }

    def withCredentials(closure) {
        Config.pipeline.docker.withRegistry(getRegistryUrl(), credential, closure)
    }

}
