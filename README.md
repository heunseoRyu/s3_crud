I watched this video
https://youtu.be/0oa34RAGQGU?si=j5uHmfQsmZu9raeo

But I faced some errors

First error
```
Error uploading fileThe bucket you are attempting to access must be addressed using the specified endpoint.
Please send all future requests to this endpoint. (Service: S3, Status Code: 301,
Request ID: PDJ23KRE10EAD6XR,
Extended Request ID: sBayTX7vJitZLm1hZq0n0vmHDsxnXVLAPGPMhaQ02WtBpnfchm3tbfEctYC8YGXEx+CsQ+lHgts=)
```
(solution)
In video, he used the ap-northest-1(Tokyo) but, 
I should use the ap-northest-2(Seoul). so I changed the region informs.

Second error 

<img width="500" alt="스크린샷 2024-04-21 오후 3 44 04" src="https://github.com/heunseoRyu/s3_crud/assets/120763372/df43d3ff-d35a-4c1e-9b47-033e349477ce">

```
Error uploading fileUnable to load region from any of the providers in the chain
software.amazon.awssdk.regions.providers.DefaultAwsRegionProviderChain@7a304891:
[software.amazon.awssdk.regions.providers.SystemSettingsRegionProvider@4d603f: Unable to load region from system settings.
Region must be specified either via environment variable (AWS_REGION) or  system property (aws.region).,
software.amazon.awssdk.regions.providers.AwsProfileRegionProvider@782c89b3:
No region provided in profile: default, software.amazon.awssdk.regions.providers.InstanceProfileRegionProvider@4dd5b699:
Unable to contact EC2 metadata service.] 
```
(solution)
it was the configure problem

I followed last one of this.
https://devvkkid.tistory.com/224

<img width="500" alt="스크린샷 2024-04-21 오후 4 21 56" src="https://github.com/heunseoRyu/s3_crud/assets/120763372/8311fe2d-5763-4454-a00a-92f3d703dee3">
finally I succeed!!

<img width="500" alt="스크린샷 2024-04-21 오후 4 26 22" src="https://github.com/heunseoRyu/s3_crud/assets/120763372/a5386e22-f20e-4caa-87f3-006e864307e3">
(IN s3)



