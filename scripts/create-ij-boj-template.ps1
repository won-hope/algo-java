$targetDir = "C:\Users\young\AppData\Roaming\JetBrains\IntelliJIdea2025.3\templates"
New-Item -ItemType Directory -Path $targetDir -Force | Out-Null

@"
<templateSet group="BOJ">
  <template name="boj" value="import java.io.BufferedReader;&#10;import java.io.IOException;&#10;import java.io.InputStreamReader;&#10;import java.util.StringTokenizer;&#10;&#10;public class Main {&#10;    public static void main(String[] args) throws IOException {&#10;        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));&#10;        StringBuilder sb = new StringBuilder();&#10;&#10;        // TODO: solve here&#10;&#10;        System.out.println(sb.toString());&#10;    }&#10;}&#10;" description="BOJ Java main template" toReformat="true" toShortenFQNames="true">
    <context>
      <option name="JAVA_CODE" value="true" />
    </context>
  </template>
</templateSet>
"@ | Set-Content -Path (Join-Path $targetDir "BOJ.xml") -Encoding UTF8
