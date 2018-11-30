const { exec } = require('child_process');

const callThread = () => {
	console.log(`Let''s call the thread`);
	const child = exec('java Test', (err, stdOut, stdErr)=>{
		if(err){
			console.log('err' + err);
		}
		if(stdOut){
			console.log('stdOut: ' + stdOut);
		}
		if(stdErr){
			console.log('stdErr:' + stdErr);
		}
	});
	
	child.on('close', ()=>{console.log('Process closed triggered')});

	console.log(`End of thread call`);
}


callThread();
