# JCloudScale

JCloudScale is a Java-based framework for building transparently scaling cloud applications. The goal of JCloudScale is that users can write elastic cloud applications (i.e., applications that dynamically acquire and release resources from a cloud) just like regular Java apps, and let JCloudScale deal with the cloud.

All in all, JCloudScale handles the following tasks:

* **Remoting** (applications look like regular, local Java applications - remoting between different hosts is handled by JCloudScale)
* **Virtual machine management** (applications don't need to keep track of virtual resources they have acquired from the cloud)
* **Application monitoring** (JCloudScale has an integrated event-based monitoring system, which allows applications to keep track of their performance)
* **Code distribution** (applications don't need to care about getting their code to newly created virtual machines) 

To simplify a bit, you can think of JCloudScale as your personal Platform-as-a-Service middleware.

In order to get started, you should check out the following resources:

* Our [First Steps](docs/FirstSteps.md) guide.
* The full [documentation](docs/Documentation.md).