rootProject.name = "netflix"

include("netflix-apps:app-api")
include("netflix-apps:app-batch")

include("netflix-adapter:adapter-http")
include("netflix-adapter:adapter-persistence")

include("netflix-commons")


include("netflix-core:core-domain")
include("netflix-core:core-port")
include("netflix-core:core-service")
include("netflix-core:core-usecase")
