#version 330 compatibility

in vec2 texCoord;
in vec2 lightCoord;
in vec4 color;
in vec3 lighting;
out vec4 FragColor;

uniform sampler2D texture;
uniform sampler2D lightmap;

void main(){
    vec4 center = texture2D(DiffuseSampler, texCoord);
    vec4 up     = texture2D(DiffuseSampler, texCoord + vec2(        0.0, -oneTexel.y));
    vec4 down   = texture2D(DiffuseSampler, texCoord + vec2( oneTexel.x,         0.0));
    vec4 left   = texture2D(DiffuseSampler, texCoord + vec2(-oneTexel.x,         0.0));
    vec4 right  = texture2D(DiffuseSampler, texCoord + vec2(        0.0,  oneTexel.y));
    vec4 uDiff = center - up;
    vec4 dDiff = center - down;
    vec4 lDiff = center - left;
    vec4 rDiff = center - right;
    vec4 sum = uDiff + dDiff + lDiff + rDiff;
    vec3 clamped = clamp(center.rgb - sum.rgb, 0.0, 1.0);
    gl_FragColor = vec4(clamped, center.a);
}
