<?php
$commitMessage = $_POST['commitMessage'];
$output = shell_exec("git add . 2>&1 && git commit -m '{$commitMessage}' 2>&1 && git push origin main 2>&1");
echo $output;
?>
