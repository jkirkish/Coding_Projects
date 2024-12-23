import axios, { CanceledError } from 'axios';
import { useEffect, useState } from 'react';

interface User {
  id: number;
  name: string;
  username: string;
}

function App() {
  const [users, setUsers] = useState<User[]>([]);
  const [error, setError] = useState('');
  const [isLoading, setLoading] = useState(false);

/* An object that holds the eventual result or failure of an asynchronous operation
*/
    useEffect(() =>{
      const controller = new AbortController();
      setLoading(true);
         axios.get<User[]>("https://jsonplaceholder.typicode.com/users", {signal: controller.signal})
        .then((res) => {
          setUsers(res.data);
          setLoading(false);
          })
        .catch(err => {
        if (err instanceof CanceledError) return;
          setError(err.message);
          setLoading(false);
      });
      
    return () => controller.abort();
    }, [] )
     return(
      <>
      {error && <p className="text-danger">{error}</p>}
      {isLoading && <div className="spinner-border"></div>}
      <ul>
        {users.map(user => <li key={user.id}>{user.name}, {user.username}</li>)}
      </ul>
     </>

)}
 
export default App
