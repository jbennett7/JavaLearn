let s:env = "!ssh ubuntu@tomcat -C 'cd java;"

function Update()
  let l:cmd = "git pull"
  execute s:env . l:cmd . "'"
endfunction
